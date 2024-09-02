# Introdução
Este repositório tem como objetivo a resolução das questões propostas para a vaga de estágio.

<br>

# Estrutura do Repositório
- A pasta `sequencia-fibonacci` contém a solução para a **Questão 1**.
- A pasta `verifica-caracter` contém a solução para a **Questão 2**.

<br>

# Tecnologias Utilizadas
- Java
- Visual Studio Code

<br>

## Resolução das Questões
<br>

### Questão 3:
#### Enunciado:
Dado o código a seguir, qual será o valor da variável `SOMA` após sua execução?



### Questão 3:
- soma = `66`

```java
    public static void main(String[] args) {
        int soma = 0;
        int  k = 1;
        for(int indice = 12; k < indice; k++){
            soma = soma + k;
        }

        System.out.println(soma);
    }
```

<br>

### Questão 4:
**A) 1, 3, 5, 7, ...**

#### Resposta:
Próximo número: 9  
- Lógica: A sequência é composta por números ímpares incrementados de 2 em 2.
```java
    public static void main(String[] args) {
        int repetir = 4;
        int inicial = 1;       
        for(int i = 0; i <= repetir; i++){
            System.out.println(inicial);
            inicial = inicial + 2;           
        }
        
    }
```

<br>

**B) 2, 4, 8, 16, 32, 64, ...**

#### Resposta:
Próximo número: 128  
- Lógica: Cada número é o dobro do anterior. 
```java
    public static void main(String[] args) {
        int repetir = 6;
        int inicial = 2;       
        for(int i = 0; i <= repetir; i++){
            System.out.println(inicial);
            inicial = inicial * 2;           
        }
        
    }
```

<br>


**C) 0, 1, 4, 9, 16, 25, 36, ...**

#### Resposta:
Próximo número: 49
- Lógica: Sequência de quadrados perfeitos (n^2).
```java 
    public static void main(String[] args) {
        int repetir = 8;
        int inicial = 0;
        int resultado;
        for(int i = 0; i < repetir; i++){          
            resultado = (int) Math.pow(inicial, 2);
            inicial++;
            System.out.println(resultado);
        } 
    }
```  

<br>

**d) 4, 16, 36, 64, ...**

#### Resposta:
- Próximo número: 100
Lógica: Sequência dos quadrados de números pares (2^2, 4^2, 6^2, 8^2...).
```java
    public static void main(String[] args) {
        int repetir = 4;
        int inicial = 2;  
        int resultado;
        
        for(int i = 0; i <= repetir; i++){
            resultado = (int) Math.pow(inicial, 2);
            inicial += 2;          
            System.out.println(resultado);
        }
        
    }
```
<br>

**e) 1, 1, 2, 3, 5, 8, ...**

#### Resposta:
Próximo número: 13  
- Lógica: Sequência de Fibonacci.
```java
    public static void main(String[] args) {
        int repetir = 3;
        int inicial = 1;  
        int valorfinal = 1;
        
        for(int i = 0; i <= repetir; i++){
           System.out.println(inicial);
           System.out.println(valorfinal);
           inicial += valorfinal;
           valorfinal += inicial;
        }
        
    }
```
**f) 2, 10, 12, 16, 17, 18, 19, ...**

#### Resposta:
Próximo número: 20
- Sendo pensado essa lógica abaixo.
```java
    public static void main(String[] args) {
        int repetir = 7;
        int inicial = 2;  
        int valorfinal = 8;
        int auxiliar;
        auxiliar = inicial;
        int j = 0;
        for(int i = 0; i <= repetir; i++){
            System.out.println(inicial);
            if(j == 0){
                if(valorfinal <= 2){
                    valorfinal = 1;
                }
                    
                inicial += valorfinal;
                
                if(valorfinal>2){
                valorfinal = valorfinal /2;
                }
                
                j++;
            }else{
                inicial += auxiliar;
                auxiliar = 1;
                j--;
            }           
        }    
    }
```

<br>

### Questão 5:
> exemplo: interrupotres( A, B, C)
- ligaria o interruptor `A` por um tempo e depois o desligaria, deixaria o interrupor `B` ligado e o `C` desligado e no momento de visitar a sala verificaria o estado das lampadas.
