package model;

public class Recursive2 {
   
    private int n;
    private int n2;
   
    public int getN() {
        return n; 
    }

    public void setN(int n){
        this.n = n;
    }
   
    public int getN2() {
        return n2; 
    }

    public void setN2(int n){
        this.n2 = n;
    }

    //1 - Soma Recursiva
    public int soma(){
        return somaRecursiva(n);
    }

    private int somaRecursiva(int n){
        if(n <= 0){
            return 0;    
        }
        System.out.println("n agora em soma é: " + n);
        return n + somaRecursiva(n - 1);
    }

    //2 - Imprimir Crescente
    public void crescente(){
        System.out.println("Contando até " + n);
        crescenteRecursiva(n);
    }
    
    private void crescenteRecursiva(int n){
        if (n < 0) {
            return;
        }
        crescenteRecursiva(n-1);
        System.out.println(n);
    }

    //decrescente
    public void descrescente(){
        System.out.println("Fazendo a descrescente de " + n);
        descrescenteRecursiva(n);
    }
  
    private void descrescenteRecursiva(int n){
        if (n < 0) {
            return;
        }
        System.out.println(n);
        descrescenteRecursiva(n - 1);
    }

    // 3 - Divisão

    public int div() {
        return divisao(n, n2);
    }

    private int divisao(int n, int n2) {
        return n / n2;
    }

    // 4 - 2 elevado a n

    public double pot() {
        return potencia2(n);
    }

    //private double potencia2(int n) {
    //    if (n < 0){
    //        return;
    //    }
    //    return 2 * potencia2(n - 1)
    //}

}