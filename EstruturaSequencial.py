#1 Faça um Programa que mostre a mensagem "Alo mundo" na tela.
print("Alo mundo")

#2 Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
num = input("Informe um numero: ")
print("O número informado foi {}".format(num))

#3 Faça um Programa que peça dois números e imprima a soma.
num = int(input('Informe o primeiro numero: ')) #obs: o input sempre recebe como string sendo necessário converter para int(), porém, o texto do input deve estar em ''
num1 = int(input('Informe o segundo numero: '))
soma = num + num1
print("Soma: ",soma)

#4 Faça um Programa que peça as 4 notas bimestrais e mostre a média.
num1 = float(input("informe sua nota do 1º Bimestre: "))
num2 = float(input("informe sua nota do 2º Bimestre: "))
num3 = float(input("informe sua nota do 3º Bimestre: "))
num4 = float(input("informe sua nota do 4º Bimestre: "))
media = (num1 + num2 + num3 + num4) / 4
print("",media)
#5 Faça um Programa que converta metros para centímetros.
metros = int(input("Informe os metros: "))
print("Centrimetros: ",metros*100)
#Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
raio = int(input("Informe o raio do circulo: "))
area = 3.14 * (raio * raio)
print("Area do circulo: ",area)

#Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
areaQuad = int(input("Informe a medida do lado do quadrado: ")))


#Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
#Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.

    # C = (5 * (F-32) / 9).

#Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
#Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:

    #o produto do dobro do primeiro com metade do segundo .
    #a soma do triplo do primeiro com o terceiro.
    #o terceiro elevado ao cubo.

#Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
#(72.7*altura) - 58
#Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
        #Para homens: (72.7*h) - 58
        #Para mulheres: (62.1*h) - 44.7 (h = altura)
        #Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.

#João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e verifique se há excesso. Se houver, gravar na variável excesso e na variável multa o valor da multa que João deverá #pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
#Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:

    #salário bruto.
    #quanto pagou ao INSS.
    #quanto pagou ao sindicato.
    #o salário líquido.
    #calcule os descontos e o salário líquido, conforme a tabela abaixo:

    #+ Salário Bruto : R$
    #- IR (11%) : R$
    #- INSS (8%) : R$
    #- Sindicato ( 5%) : R$
    #= Salário Liquido : R$

    #Obs.: Salário Bruto - Descontos = Salário Líquido.

#Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
#Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.

    #Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
    #comprar apenas latas de 18 litros;
    #comprar apenas galões de 3,6 litros;
    #misturar latas e galões, de forma que o preço seja o menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

#Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).