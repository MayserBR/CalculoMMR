public class Classificacoes {

    public int valorMmr; //Valor convertido em porcentagem

    public int getValorMmr(){
        return valorMmr;
    }

    public void setValorMmr(int valorMmr){
        this.valorMmr = valorMmr;
    }

    public String classific(InterfaceMMR totalVitorias){
        int partidas = 50; //Total de Partidas Jogadas para classificação de Rank
        valorMmr = 100 * totalVitorias.getTotalVitorias() / partidas; //Regra de 3 para obtenção de porcentagem a partir do numero de vitorias.

    if(valorMmr <= 10){                                 //1
        return "Classificação Ranqueada Ferro";         //2
    } else if (valorMmr <= 20){                         //3
        return "Classificação Ranqueada Bronze";        //4
    } else if (valorMmr <= 30){                         //5
        return "Classificação Ranqueada Prata";         //6
    } else if (valorMmr <= 40){                         //7
        return "Classificação Ranqueada Ouro";          //8
    } else if (valorMmr <= 50){                         //9
        return "Classificação Ranqueada Platina";       //10
    } else if (valorMmr <= 60){                         //11
        return "Classificação Ranqueada Diamante";      //12
    } else if (valorMmr <= 70){                         //13
        return "Classificação Ranqueada Mestre";        //14
    } else if (valorMmr <= 80) {                        //15
        return "Classificação Ranqueada Grão Mestre";   //16
    } else if (valorMmr <= 90) {                        //17
        return "Classificação Ranqueada Desafiante";    //18
    } else {
        return "Classificação Ranqueada Global";        //19
    }
    
    }                                                   //20


}
