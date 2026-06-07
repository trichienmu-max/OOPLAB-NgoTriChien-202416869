import javax.swing.JOptionPane;

public class bai61{
    public static void main(String[] args) {

        int option = JOptionPane.showConfirmDialog(
                null,
                "Do you want to change to the first class ticket?"
        );

        JOptionPane.showMessageDialog(
                null,
                "You've chosen: " +
                (option == JOptionPane.YES_OPTION ? "Yes" : "No")
        );

        System.exit(0);
    }
} 
/*
Cau 1: Neu nguoi dung chon Cancel thi ham
JOptionPane.showConfirmDialog() tra ve:

JOptionPane.CANCEL_OPTION (gia tri = 2)

Neu nguoi dung dong cua so (bam dau X) thi tra ve:

JOptionPane.CLOSED_OPTION (gia tri = -1)
Cau 2:
Co the tuy chinh cac nut bang cach dung
JOptionPane.showOptionDialog() thay vi showConfirmDialog().

CODE:
String[] options = {"I do", "I don't"};

int choice = JOptionPane.showOptionDialog(
        null,
        "Do you agree?",
        "Question",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        options,
        options[0]
);

Gia tri tra ve:

"I do" → 0
"I don't" → 1
 */