
/* Se você está vendo esta mensagem é porque fez tudo certo até aqui. 
    Boa prova! */

void main() {
    double consumoDoDia;
    double consumoTotal = 0;
    int totalDias = 0;
    double media;
    consumoDoDia = Double.parseDouble(IO.readln("Consumo total no dia foi de:"));

    while (consumoDoDia != 0) {  
        consumoTotal = consumoTotal + consumoDoDia;
     totalDias++;
     consumoDoDia = Double.parseDouble(IO.readln("Consumo do outro dia: "));
    }
    if (totalDias > 0) {
        media = consumoTotal / totalDias;
      System.out.printf("A media de consumo foi: %.2f litros\n", media);
        if (media < 100) {
      System.out.println("Consumo Sustentável");
        } else if (media <= 175) {
      System.out.println("Consumo Moderado");
        } else {
        System.out.println("Consumo Excessivo");
        }
    } else {
        System.out.println("Precisa ter consumo");
    }
}