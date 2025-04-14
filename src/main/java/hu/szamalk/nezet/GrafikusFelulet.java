package hu.szamalk.nezet;

import javax.swing.*;

public class GrafikusFelulet {
    private JComboBox comboBox1;
    private JButton OKButton;
    private JButton cancelButton;
    private JButton szoborFelviteleButton;
    private JButton masolasButton;
    private JList list1;
    private JPanel pnlMain;

    private JFrame frame;
    private JMenuItem mitMent,mitBetolt;

    public static void main(String[] args) {
        new GrafikusFelulet();
    }

    public GrafikusFelulet(){
        ini();
    }



    private void ini() {
        frame = new JFrame("Mukincsek");
        frame.setTitle("Feladat");
        frame.setSize(320,410);
        frame.setContentPane(pnlMain);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        DefaultListModel<String> dlm = new DefaultListModel<>();
        list1.setModel(dlm);


        mitMent = new JMenuItem("Mentés");
        mitBetolt = new JMenuItem("Betölt");
        JMenu mnuPrg = new JMenu("Program");
        mnuPrg.add(mitMent);
        mnuPrg.add(mitBetolt);
        mnuPrg.add(new JSeparator());
        mnuPrg.add(new JMenuItem("Kilépés"));
        JMenuBar mnuBar = new JMenuBar();
        mnuBar.add(mnuPrg);
        frame.setJMenuBar(mnuBar);
        frame.pack();


    }


}
