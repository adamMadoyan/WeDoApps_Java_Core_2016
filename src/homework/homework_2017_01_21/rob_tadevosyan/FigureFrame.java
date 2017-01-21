package homework.homework_2017_01_21.rob_tadevosyan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class FigureFrame extends JFrame implements EnemiesInterface, Observer {

    public static void main(String[] args) {
        new FigureFrame();
    }

    private final int firstStartX = 10;
    private final int firstStartY = 10;
    private final int secondStartX = 400;
    private final int secondStartY = 10;
    private final int thirdStartX = 350;
    private final int thirdStartY = 350;
    private final int fourthStartX = 10;
    private final int fourthStartY = 360;
    private final int gamerStartX = 200;
    private final int gamerStartY = 200;

    private FigureCanvas canvas = new FigureCanvas(this);

    private Rectangle first;
    private Rectangle second;
    private Rectangle third;
    private Rectangle fourth;
    private Rectangle gamer;
    private long startTime;
    private long endTime;
    private Stopwatch stopwatch;
    private JLabel time;
    private boolean gameIsPlaying = false;
    private double record;
    private Random random = new Random();

    public FigureFrame() throws HeadlessException {
        super("Avoid Squares");

        time = new JLabel();
        JPanel configPanel = new JPanel();
        configPanel.add(time);
        first = new Rectangle(this, firstStartX, firstStartY, 100, 100, Color.BLACK);
        second = new Rectangle(this, secondStartX, secondStartY, 80, 70, Color.BLACK);
        third = new Rectangle(this, thirdStartX, thirdStartY, 100, 30, Color.BLACK);
        fourth = new Rectangle(this, fourthStartX, fourthStartY, 60, 70, Color.BLACK);
        gamer = new Rectangle(this, gamerStartX, gamerStartY, 60, 60, new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255), random.nextInt(100) + 10));
        first.addObserver(this);
        second.addObserver(this);
        third.addObserver(this);
        fourth.addObserver(this);
        gamer.setEnemy(false);
        canvas.add(first);
        canvas.add(second);
        canvas.add(third);
        canvas.add(fourth);
        canvas.add(gamer);
        add(configPanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocation(150, 80);
        setResizable(false);
        canvas.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                addActionPerformed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        setVisible(true);
    }

    private void firstTimerAction() {
        catchGamerChecking(first.getX(), first.getY(), first.getWidth(), first.getHeight());
    }

    private void secondTimerAction() {
        catchGamerChecking(second.getX(), second.getY(), second.getWidth(), second.getHeight());
    }

    private void thirdTimerAction() {
        catchGamerChecking(third.getX(), third.getY(), third.getWidth(), third.getHeight());
    }

    private void fourthTimerAction() {
        catchGamerChecking(fourth.getX(), fourth.getY(), fourth.getWidth(), fourth.getHeight());
    }

    private void movingActionPerformed() {

    }

    private void createAndOpenGameOverOptionPane() {
        int options = JOptionPane.showOptionDialog(this,
                "You record is: " + (record),
                "Game Over in :" + time.getText(), JOptionPane.CLOSED_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Ok"},
                JOptionPane.CANCEL_OPTION);
        if (options == 0) {
            restartGame();
        }
    }

    private void addActionPerformed(MouseEvent e) {
        if (gamer.isBelong(e.getX(), e.getY())) {
            startMoveEnemies();
        }
    }

    public void setTime() {
        if (stopwatch != null) {
            time.setText(String.valueOf(stopwatch.elapsedTime()));
        }
    }

    private void startMoveEnemies() {
        if (!gameIsPlaying) {
            stopwatch = new Stopwatch();
            stopwatch.restart();
            first.getTimer().start();
            second.getTimer().start();
            third.getTimer().start();
            fourth.getTimer().start();
            gameIsPlaying = true;
        }
    }

    private void stopMoveEnemies() {
        if (gameIsPlaying) {
            first.getTimer().stop();
            second.getTimer().stop();
            third.getTimer().stop();
            fourth.getTimer().stop();
            gameIsPlaying = false;
            if (record == 0) {
                record = stopwatch.elapsedTime();
            } else if (record < stopwatch.elapsedTime()) {
                record = stopwatch.elapsedTime();
            }
        }
    }

    private void restartGame() {
        first.setX(firstStartX);
        first.setY(firstStartY);
        second.setX(secondStartX);
        second.setY(secondStartY);
        third.setX(thirdStartX);
        third.setY(thirdStartY);
        fourth.setX(fourthStartX);
        fourth.setY(fourthStartY);
        gamer.setX(gamerStartX);
        gamer.setY(gamerStartY);
        time.setText("");
        repaint();
    }


    public void catchGamerChecking(int enemyX, int enemyY, int enemyWidth, int enemyHeight) {
        if (gamer.isBelong(enemyX, enemyY) || gamer.isBelong(enemyX + enemyWidth, enemyY + enemyHeight) || gamer.isBelong(enemyX, enemyY + enemyHeight) || gamer.isBelong(enemyX + enemyWidth, enemyY)) {
            stopMoveEnemies();
            makeEnemiesFaster(25);
            createAndOpenGameOverOptionPane();
        }
    }

    @Override
    public void gameOver() {
        int x = gamer.getX();
        int y = gamer.getY();
        int width = x + gamer.getWidth();
        int height = y + gamer.getHeight();
        if (x <= 2 || width >= 500 || y <= 2 || height >= 450) {
            stopMoveEnemies();
            makeEnemiesFaster(25);
            createAndOpenGameOverOptionPane();
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        firstTimerAction();
        secondTimerAction();
        thirdTimerAction();
        fourthTimerAction();
        setTime();
        double currT = stopwatch.elapsedTime();
        if (currT < 5) {
            makeEnemiesFaster(25);
        } else if (currT > 5 && currT < 7) {
            makeEnemiesFaster(22);
        } else if (currT > 7 && currT < 10) {
            makeEnemiesFaster(19);
        } else if (currT > 10 && currT < 18) {
            makeEnemiesFaster(16);
        } else if (currT > 15 && currT < 25) {
            makeEnemiesFaster(12);
        } else if (currT > 25 && currT < 35) {
            makeEnemiesFaster(8);
        } else if (currT > 33 && currT < 38) {
            makeEnemiesFaster(5);
        } else if (currT > 38) {
            makeEnemiesFaster(1);
        }
    }

    private void makeEnemiesFaster(int delay) {
        first.getTimer().setDelay(delay);
        second.getTimer().setDelay(delay);
        third.getTimer().setDelay(delay);
        fourth.getTimer().setDelay(delay);
    }
}
