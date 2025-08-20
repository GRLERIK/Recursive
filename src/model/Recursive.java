package model;

public class Recursive {
   
    private int n;
   
    public int getN() {
        return n; 
    }

    public void setN(int n){
        this.n = n;
    }

    public int soma(){
        return somaRecursiva(n);
    }
    //1
    private int somaRecursiva(int n){
        if(n <= 0){
            return 0;    
        }
        System.out.println("n agora em soma é: " + n);
        return + somaRecursiva(n - 1);
    }

    //2
    //crescente
    public void crescente(){
        System.out.println("Contando até " + n);
        crescenteRecursiva(n);
    }
    
    private void crescenteRecursiva(int n){
        if(n < 0){
            return;    
        }
        crescenteRecursiva(n-1);
        System.out.println(n);
    }

    //decrescente
    public int descrescente(){
        System.out.println("Fazendo a descrescente de " + n);
        return descrescenteRecursiva(n);
    }
  
    private int descrescenteRecursiva(int n){
        if(n <= 0){
            return 0;    
        }
        System.out.println(n);
        return descrescenteRecursiva(n - 1);
    }

    //Questão 3
    public int divisaoInt(int a, int b) {
        return divisao(a, b);
    }

    private int divisao(int a , int b) {
        if (a < b) {
            return 0;
        }
        return 1 + divisao( a - b, b);
    }
}