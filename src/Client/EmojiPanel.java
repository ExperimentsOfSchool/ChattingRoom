package Client;

import javax.swing.*;

public class EmojiPanel extends JDialog {
    private JPanel contentPane;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton buttonOK;

    public EmojiPanel() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        EmojiPanel dialog = new EmojiPanel();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
