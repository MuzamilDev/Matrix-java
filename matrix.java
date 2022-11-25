import javax.swing.*;

class matrix{
    int x[][] = new int[3][3];
    int y[][] = new int[3][3];
    int z[][] = new int[3][3];
    int i , j , k , n;

    String st;
    void getadata()
    {
        for(i=0; i<3; i++)
            for(j=0; j<3; j++)
            {
               st= JOptionPane.showInputDialog("Enter x["+ (i+1)+"]" + "["+(j+1)+"]");
                x[i][j]=Integer.parseInt(st);
            }
        for(i=0; i<3; i++)
            for(j=0; j<3; j++)
            {
                st=JOptionPane.showInputDialog("Enter y["+(i+1)+"]" + "["+(j+1)+"]");
                y[i][j]=Integer.parseInt(st);
            }
    }
    void multiply()
    {
        for(i=0; i<3; i++)
            for(j=0; j<3;j++)
            {
                z[i][j]=0;
                for(k=0; k<3; k++)
                    z[i][j]=z[i][j]+x[i][j]*y[k][i];
            }
    }
    void print()
    {
        st="Resultant MATRIX \n";
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
                st=st+z[i][j]+ " ";
            st=st+"\n";
        }
        JOptionPane.showMessageDialog(null,st);
    }
}
public class twodimensional {
    public static void main(String[] args) {
        matrix obj =new matrix();
        obj.getadata();
        obj.multiply();
        obj.print();
        System.exit(0);

    }
}
