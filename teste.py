numbers = ['0', "4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"]
suits =   ['0', "♦", "♠", "♥", "♣"]

appendHand = [['4♥']]

lista = []
mesa = [['3♠']]
mesa = mesa [0]
mesa = mesa [0]
for itens in appendHand:
    for n in itens:

        if '♦' in n[1]:
            if numbers.index(n[0]) == numbers.index(mesa[0]) + 1 :
                res = ((ord('♦') - 7)) * numbers.index(n[0]) * 2000
                lista.append(res)
            else:
                res = ((ord('♦') - 7)) * numbers.index(n[0])
                lista.append(res)

        elif '♠' in n[1]:
                if numbers.index(n[0]) == numbers.index(mesa[0]) + 1 :
                    res = (ord('♠')) * numbers.index(n[0]) * 2000
                    lista.append(res)
                else:
                    res = (ord('♠')) * numbers.index(n[0])
                    lista.append(res)

        elif '♥' in n[1]:
            if (n[0] == '4' and mesa[0] == '3') or numbers.index(n[0]) == numbers.index(mesa[0]) + 1 :
                res = ((ord('♥') - 4)) * numbers.index(n[0]) * 2000
                lista.append(res)
            else:
                res = ((ord('♥') - 4)) * numbers.index(n[0])
                lista.append(res)

        elif '♣' in n[1]:
            if numbers.index(n[0]) == numbers.index(mesa[0]) + 1 :
                res = (ord('♣') - 1) * numbers.index(n[0]) * 2000
                lista.append(res)
            else:
                res = (ord('♣') - 1) * numbers.index(n[0])
                lista.append(res)

appendHand[lista.index(max(lista))]


numbers = ['0', "4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"]
suits =   ['0', "♦", "♠", "♥", "♣"]

table = 'A♣'
n = 'A♥'
lista = []
if '♥' in n[1]:
    if numbers.index(n[0]) == numbers.index(table[0]) + 1 :
        res = ((ord('♦') - 7)) * numbers.index(n[0]) * 2000
        lista.append(res)
    else:
        res = ((ord('♦') - 7)) * numbers.index(n[0])
        lista.append(res)
print(res)

numbers = ['0', "4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"]
suits =   ['0', "♦", "♠", "♥", "♣"]
deck = []
for i in numbers[1:]:
 for x in suits[1:]:
     deck.append(i+x)
print(deck)
