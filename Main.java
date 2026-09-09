import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { //GUI Elemente laufen so in einem anderen Thread als dem Hauptthread (im Event Dispatch Thread) weil Swing ist nicht threadsafe
            Dashboard dashboard = new Dashboard();
        });
    }
}
