package pacman;

import javax.swing.*;
import java.awt.*;
import java.awt.dnd.DropTargetAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static jdk.internal.misc.VM.initLevel;

public class Model extends JPanel implements ActionListener {

    private Dimension d;
    private final Font smallFont = new Font ("Arial", Font.BOLD, 14);
    private Boolean inGame = false;
    private Boolean dying = false;

    private final int BLOCK_SIZE  = 24;
    private final int N_BLOCKS = 15;
    private final int SCREEN_SIZE = N_BLOCKS * BLOCK_SIZE;
    private final int MAX_GHOSTS = 12;
    private final int PACMAN_SPEED = 6;

    private int N_GHOSTS = 6;
    private int live;
    private int score;
    private int () dx;
    private int () dy;
    private int () ghost_x;
    private int () ghost_y;
    private int () ghost_dx;
    private int () ghost_dy;
    private int () shostSpeed;

    private Image heart, ghost;
    private Image up, down, left, right;

    private int pacman_x, pacman_y, pacmand_x, pacmand_y;
    private int req_dx, req_dy;

    private final int validSpeeeds[] = {1,2,3,4,6,8};
    private final int maxSpeed = 6;
    private final int currentSpeed = 3;
    private short [] screenData;
    private Timer timer;

    private final short leveData[] = {
            19, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 22,
            17, 16, 16, 16, 16, 24, 16, 16, 16, 16, 16, 16, 16, 16, 20,
            25, 24, 24, 24, 28, 0, 17, 16, 16, 16, 16, 16, 16, 16, 20,
            0,  0,  0,  0,  0,  0, 17, 16, 16, 16, 16, 16, 16, 16, 20,
            19, 18, 18, 18, 18, 18, 16, 16, 16, 16, 24, 24, 24, 24, 20,
            17, 16, 16, 16, 16, 16, 16, 16, 16, 20, 0,  0,  0,  0,  21,
            17, 16, 16, 16, 16, 16, 16, 16, 16, 20, 0,  0,  0,  0,  21,
            17, 16, 16, 16, 24, 16, 16, 16, 16, 20, 0,  0,  0,  0,  21,
            17, 16, 16, 20, 0, 17, 16, 16, 16, 16, 18, 18, 18, 18, 20,
            17, 24, 24, 28, 0, 25, 24, 24, 16, 16, 16, 16, 16, 16, 20,
            21, 0,  0,  0,  0,  0,  0,   0, 17, 16, 16, 16, 16, 16, 20,
            17, 18, 18, 22, 0, 19, 18, 18, 16, 16, 16, 16, 16, 16, 20,
            17, 16, 16, 20, 0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 20,
            17, 16, 16, 20, 0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 20,
            25, 24, 24, 24, 26, 24, 24, 24, 24, 24, 24, 24, 24, 24, 28



    };

    pubic Model () {
        loadImages();
        initVariables();
        addKeyListener(new TAdapter());
        setFocusable(true);
        initGame();

    }

    private void loadImages() {
        down = new ImageIcon("/home/idham/Downloads/image pacman.gif").getImage();
        up = new ImageIcon("/home/idham/Downloads/image pacman.gif").getImage();
        left = new ImageIcon("/home/idham/Downloads/image pacman.gif").getImage();
        right = new ImageIcon("/home/idham/Downloads/image pacman.gif").getImage();
        ghost = new ImageIcon("/home/idham/Downloads/image pacman.gif").getImage();
        heart = new ImageIcon("/home/idham/Downloads/image pacman.gif").getImage();
    }

    private void initVariables() {
        screenData = new Short (N_BLOCKS * N_BLOCKS);
        d = new Dimension(400,400);
        ghost_x = new int[MAX_GHOSTS];
        ghost_dx = new int[MAX_GHOSTS];
        ghost_y = new int[MAX_GHOSTS];
        ghost_dy = new int[MAX_GHOSTS];
        ghostSpeed = new int[MAX_GHOSTS];
        dx = new int[4];
        dy = new int[4];

        timer = new Timer(40,this);
        timer.restart();

    }
    
    private void initGame(){
        lives = 3;
        score = 0;
        initLevel();
        N_GHOSTS = 6;
        currentSpeed = 3;
    }

    private void initLevel(){
        int i;
        for (i = 0;  i< N_BLOCKS * N_BLOCKS; i++){
            screenData[i] = levelData[i];
        }
    }

    private void playGame (Graphics2D g2d){

    }





    private continueLevel(){
        int dy = 1;
        int random;

        for (int i = 0; i< N_GHOSTS; i++){
            ghost_y[i] = 4* GHOST_SIZE;
            ghost_x[i] = 4* GHOST_SIZE;
            ghost_dy[i] = 0;
            ghost_dx[i] = dx;
            dx = -dx;
            random = (int) (Math.random() * (currentSpeed +1 ));

            if (random > currentSpeed) {
                random = currentSpeed;
            }

            ghostSpeed[i] = validSpeeeds[random];

            }

        pacman_x = 7 * BLOCK_SIZE;
        pacman_y = 11 * BLOCK_SIZE;
        pacman_x = 0;
        pacman_y = 0;
        req_dx = 0;
        req_dy = 0;
        dying = false;
    }

    public void paintComponent (Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, d.width, d.height);

        drawMaze(g2d);
        drawScore(g2d);

        if (inGame) {
            playGame((g2d));
        }else {
            showIntoScreen(g2d);
        }
        Toolkit.getDefaultToolkit().sync();
    }



    class TAdapter extends KeyAdapter {
        public void KeyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            if (inGame) {
                if (key == KeyEvent.VK_LEFT) {
                    req_dx = -1;
                    req_dy = 0;
                }
                else if (key == KeyEvent.VK_RIGHT) {
                    req_dx = -1;
                    req_dy = 0;
                }
                else if (key == KeyEvent.VK_UP) {
                    req_dx = -1;
                    req_dy = 0;
                }
                else if (key == KeyEvent.VK_DOWN) {
                    req_dx = -1;
                    req_dy = 0;
                }
                else if (key == KeyEvent.VK_ESCAPE && timer.isRunning()) {
                    inGAme = false;
                }
            } else {
                if (key == KeyEvent.VK_SPACE) {
                    inGame = true;
                    initGame();
                }
            }

        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
