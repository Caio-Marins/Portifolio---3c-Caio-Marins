/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

/**
 *
 * @author maria
 */
public class Caes {

    public String nome;
    public float peso;
    public int qtd_passos;
    public String humor;

    public Caes(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
        this.humor = "animado";
        this.qtd_passos = 0;
    }
    

    public String falar(String mensagem) {
       if(mensagem.equals("auau") ){

       return mensagem; 
       }else{

       return "Cahorro n fala";
       }
    }

    public boolean andar(int num_passos) {
        if (qtd_passos > 1000){
            humor = "cansado";
            return false;
        }else{
            qtd_passos = qtd_passos + num_passos;
            peso = peso - 0.01f;
            return true;
        }
    }

    public void comer() {
        peso = peso + 0.01f;
        humor = "satisfeito";
    }

    public boolean dormir() {
        if ( humor.equals("cansado")){
            qtd_passos = 0;
            humor = "animado";
            return true;
        }
        return false;
    }
}