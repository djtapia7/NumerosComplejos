/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroscomplejos;

/**
 *
 * @author dantap
 */
public class NumeroComplejo {

    private int real = 0;
    private int img = 0;

    public void cargar(String numero) {
        String parReal;
        String parImg;
        String redux = numero;
        //System.out.println(redux);

        //////////////////////////Quitar el sigo y guardar si existe////////////////////////////////////
        int sig = 0;
        
        if ("+".equals(numero.substring(0, 1))) {
            redux = numero.substring(1);

        } else {
            if ("-".equals(numero.substring(0, 1))) {
                redux = numero.substring(1);
                sig = 1;
            }
        }
        ///////////////////////////////////////////////////////////////////      

        int pos;
        pos = redux.indexOf("+");

        if (pos != -1) {
            parReal = redux.substring(0, pos);
            parImg = redux.substring(pos, redux.length() - 1);
            

        } else {
            pos = redux.indexOf("-");
            if (pos != -1) {
                parReal = redux.substring(0, pos);
                parImg = redux.substring(pos, redux.length() - 1);
                

            } else {
                System.out.println("Error");
                parReal = "real";
                parImg = "integer";
            }
        }
        //System.out.println(parReal);
        //System.out.println(parReal.length());
        //System.out.println(parImg);
        
        
        if (sig == 0) {
            this.real = Integer.parseInt(parReal);
        } if (sig == 1) {
            this.real = Integer.parseInt(parReal)*(-1);
        }

        this.img = Integer.parseInt(parImg);

    }

    public String mostrar() {
        if(this.img>=0){
            return (this.real + "+" + this.img + "i");
        }
        return (this.real + "" + this.img + "i");
    }

    public String suma(NumeroComplejo num) {
        int r = this.real + num.getReal();
        int i = this.img + num.getImg();

        if(i>=0){
            return (r + "+" + i + "i");
        }
        return (r + "" + i + "i");
    }

    public int getReal() {
        return this.real;
    }

    public int getImg() {
        return this.img;
    }
}
