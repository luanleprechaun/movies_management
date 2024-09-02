import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println();
        System.out.println("1 - Embaralhar vetor");
        System.out.println("2 - Ver vetor");
        System.out.println("3 - Checar se o vetor esta ordenado");
        System.out.println("4 - Inverter vetor");
        System.out.println("5 - Insertion sort");
        System.out.println("6 - Merge sort");
        System.out.println("7 - Quick sort");
        System.out.println("8 - Quick sort random");
        System.out.println("9 - Counting sort");
        System.out.println("10 - Busca linear iterativa");
        System.out.println("11 - Busca linear recursiva");
        System.out.println("12 - Busca binaria iterativa");
        System.out.println("13 - Busca binaria recursiva");
        System.out.println("14 - Busca linear iterativa duas pontas");
        System.out.println("0 - Sair");
        System.out.println();
        System.out.print("Escolha uma opcao: ");
    }

    public static void reverseArray(Filme[] filmes) {
        Filme temp = null;

        for (int i = 0, j = filmes.length - 1; i <= j; i++, j--) {
            temp = filmes[i];
            filmes[i] = filmes[j];
            filmes[j] = temp;
        }
    }

    public static void main(String[] args) throws Exception {
        Ordenacao sort = new Ordenacao();
        Busca busca = new Busca();
        FilmeAux filmeAux = new FilmeAux();
        Scanner scann = new Scanner(System.in);

        int quantFilmes, op, nota;
        long tempo;
        Filme filmeTemp = null;

        System.out.print("\n Quantos filmes deseja gerar? ");
        quantFilmes = scann.nextInt();

        Filme[] filmes = filmeAux.gerarFilmes(quantFilmes);

        do {
            menu();
            op = scann.nextInt();

            try {
                switch (op) {
                    case 1:
                        System.out.print("\n Quantos filmes deseja gerar? ");
                        quantFilmes = scann.nextInt();
                
                        filmes = filmeAux.gerarFilmes(quantFilmes);
                        break;

                    case 2:
                        System.out.println();

                        for (Filme filme : filmes) {
                            System.out.println(filme.toString());
                        }

                        System.out.println();
                        break;

                    case 3:
                        if (busca.checaVetorOrdenado(filmes)) {
                            System.out.println("O vetor esta ordenado");
                        } else {
                            System.out.println("O vetor nao esta ordenado");
                        }

                        break;

                    case 4:
                        reverseArray(filmes);

                        break;
                    case 5:
                        tempo = System.nanoTime();
                        sort.insertionSort(filmes);

                        System.out.println("Tempo de execucao: " + (System.nanoTime() - tempo) / 1000000000.0);
                        break;
                    case 6:
                        tempo = System.nanoTime();
                        sort.mergeSort(filmes);

                        System.out.println("Tempo de execucao: " + (System.nanoTime() - tempo) / 1000000000.0);
                        break;
                    case 7:
                        tempo = System.nanoTime();
                        sort.quickSort(filmes);

                        System.out.println("Tempo de execucao: " + (System.nanoTime() - tempo) / 1000000000.0);
                        break;
                    case 8:
                        tempo = System.nanoTime();
                        sort.quickSortRandom(filmes);

                        System.out.println("Tempo de execucao: " + (System.nanoTime() - tempo) / 1000000000.0);
                        break;
                    case 9:
                        tempo = System.nanoTime();
                        sort.countingSort(filmes);

                        System.out.println("Tempo de execucao: " + (System.nanoTime() - tempo) / 1000000000.0);
                        break;
                    case 10:
                        System.out.print("Informe a nota que deseja buscar: ");
                        nota = scann.nextInt();
                    
                        tempo = System.nanoTime();
                        filmeTemp = busca.buscaLinear_iterativa(filmes, nota);

                        if (filmeTemp == null) {
                            System.out.println("Filme nao encontrado");
                        } else {
                            System.out.println(filmeTemp.toString());
                        }

                        System.out.println("Tempo de execucao: " + (System.nanoTime() - tempo) / 1000000000.0);
                        break;
                    case 11:
                        System.out.print("Informe a nota que deseja buscar: ");
                        nota = scann.nextInt();
                    
                        tempo = System.nanoTime();
                        filmeTemp = busca.buscaLinear_recursiva(filmes, nota);

                        if (filmeTemp == null) {
                            System.out.println("Filme nao encontrado");
                        } else {
                            System.out.println(filmeTemp.toString());
                        }

                        System.out.println("Tempo de execucao: " + (System.nanoTime() - tempo) / 1000000000.0);
                        break;
                    case 12:
                        System.out.print("Informe a nota que deseja buscar: ");
                        nota = scann.nextInt();
                    
                        tempo = System.nanoTime();
                        filmeTemp = busca.buscaBinaria_iterativa(filmes, nota);

                        if (filmeTemp == null) {
                            System.out.println("Filme nao encontrado");
                        } else {
                            System.out.println(filmeTemp.toString());
                        }

                        System.out.println("Tempo de execucao: " + (System.nanoTime() - tempo) / 1000000000.0);
                        break;
                    case 13:
                        System.out.print("Informe a nota que deseja buscar: ");
                        nota = scann.nextInt();
                    
                        tempo = System.nanoTime();
                        filmeTemp = busca.buscaBinaria_recursiva(filmes, nota);

                        if (filmeTemp == null) {
                            System.out.println("Filme nao encontrado");
                        } else {
                            System.out.println(filmeTemp.toString());
                        }

                        System.out.println("Tempo de execucao: " + (System.nanoTime() - tempo) / 1000000000.0);
                        break;
                    case 14:
                        System.out.print("Informe a nota que deseja buscar: ");
                        nota = scann.nextInt();
                    
                        tempo = System.nanoTime();
                        filmeTemp = busca.buscaLinear_iterativa_duasPontas(filmes, nota);

                        if (filmeTemp == null) {
                            System.out.println("Filme nao encontrado");
                        } else {
                            System.out.println(filmeTemp.toString());
                        }

                        System.out.println("Tempo de execucao: " + (System.nanoTime() - tempo) / 1000000000.0);
                        break;
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (op != 0);

        System.out.println("Saindo...");
        scann.close();
    }
}