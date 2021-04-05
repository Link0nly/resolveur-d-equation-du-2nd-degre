import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.util.*;
import java.lang.Math.*;

public class App extends JFrame{
    public App(){
        //Structure de la fenêtre
        this.setTitle("R\u00e9solveur d'\u00e9quation du second d\u00e9gr\u00e9");
        this.setSize(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);   

        //Objet de la fenêtre
        JTextField a = new JTextField();
        a.setColumns(2);
        JTextField b = new JTextField();
        b.setColumns(2);
        JTextField c = new JTextField();
        c.setColumns(2);


        JLabel title = new JLabel("R\u00e9solveur d'\u00e9quation du second degr\u00e9 (mettez un point pour les d\u00e9cimales)");
        JLabel a1 = new JLabel("a:");
        JLabel b1 = new JLabel("b:");
        JLabel c1 = new JLabel("c:");
        JLabel resultat = new JLabel();

        JButton btn = new JButton("Trouver les solutions r\u00e9elles");
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                resultat.setText("");
                double x0, x1, x2, delta;
                double a0 = Double.parseDouble(a.getText());
                double b0 = Double.parseDouble(b.getText());
                double c0 = Double.parseDouble(c.getText()); 
                delta =(b0*b0)-4*a0*c0;
                x0 = (-b0)/(2*a0);
                x1 = (-b0-Math.sqrt(delta))/(2*a0);
                x2 = (-b0+Math.sqrt(delta))/(2*a0);
                if(delta>0){
                    resultat.setText("Les solutions r\u00e9elles sont x1="+x1+" et x2="+x2);
            }
                else if(delta<0){
                    resultat.setText("Il n'y a pas de solution r\u00e9elle");
            }
                else if(delta==0)
                    resultat.setText("La solution r\u00e9elle est x0="+x0);
                
                //je vais ajouter ce qui manque plus tard ;) c'est le début
                else{
                    resultat.setText("valeur incorrect");
                }
            }
        });


        //Contenu de la fenêtre
        JPanel p1 = new JPanel();
        p1.add(title);
        p1.setBackground(Color.orange);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.orange);
        p2.add(a1);
        p2.add(a);
        p2.add(b1);
        p2.add(b);
        p2.add(c1);
        p2.add(c);

        JPanel p3 = new JPanel();
        p3.add(btn);
        p3.add(resultat);
        p3.setBackground(Color.orange);

        JPanel pp =new JPanel();
        pp.setLayout(new BoxLayout(pp, BoxLayout.PAGE_AXIS));
        pp.add(p1);
        pp.add(p2);
        pp.add(p3);


        //mettre le contenu de la fenêtre dans la fenêtre
        this.setContentPane(pp);
    }

    public static void main(String[] args){
        JFrame frame = new App();
        frame.setVisible(true);
    }
}

