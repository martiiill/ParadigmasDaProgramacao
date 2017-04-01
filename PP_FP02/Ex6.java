        int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] listaB = {6, 99, -1, 12, 1, -2};
        int contar = 0;
        int[] listaF;
        listaF = new int[listaA.length + listaB.length];

        int[] listaAB;
        listaAB = new int[listaA.length + listaB.length];

        System.arraycopy(listaA, 0, listaAB, 0, listaA.length);

        System.arraycopy(listaB, 0, listaAB, listaA.length, listaB.length);

        for (int n = 0; n < listaAB.length; n++) {
            System.out.print(listaAB[n] + " | ");
        }

        //nao a melhor maneira
        for (int i = 0; i < listaAB.length; i++) {
            for (int j = i; j < listaAB.length; j++) {
                if (listaAB[i] == listaAB[j] && i != j) {
                    contar++;
                }
            }
        }

        System.out.println(" ");
        System.out.println("\n" + "Valores repetidos -> " + contar);

        for (int i = 0; i < listaA.length; i++) {
            for (int j = 0; j < listaB.length; j++) {
                if(listaB[j] != listaA[i]){
                    listaF[i]= listaA[j];
                }
            }
        }
        System.out.print("\n\n" + "Vetor com elementos da lista A que não se encontram na lista B:" + "\n");
        for (int i = 0; i < listaF.length;i++) {
            System.out.print(listaF[i] + " | ");
            
        }
        
        System.out.println("\n\n" + "Vetor com elementos (não repetidos) da lista A e B" + "\n");
    }
}