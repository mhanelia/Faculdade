numbers = ['0', "4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"]
suits =   ['0', "♦", "♠", "♥", "♣"]

appendHand = [['K♦', 'K♠'], ['5♣', 'J♠']]

lista = []
table = [['3♠']]
table = table[0]
table = table[0]
for itens in appendHand:
    for n in itens:
        # n = n[0]
        list2.append(n)
        if '♦' in n[1]:
            if (n[0] == '4' and table[0] == '3') or numbers.index(n[0]) == numbers.index(table[0]) + 1 :
                res = ((ord('♦') - 7)) * numbers.index(n[0]) * 2000

            else:
                res = ((ord('♦') - 7)) * numbers.index(n[0])
            lista.append(res)

        elif '♠' in n[1]:
                if (n[0] == '4' and table[0] == '3') or numbers.index(n[0]) == numbers.index(table[0]) + 1 :
                    res = (ord('♠')) * numbers.index(n[0]) * 2000

                else:
                    res = (ord('♠')) * numbers.index(n[0])
                lista.append(res)

        elif '♥' in n[1]:
            if (n[0] == '4' and table[0] == '3') or numbers.index(n[0]) == numbers.index(table[0]) + 1 :
                res = ((ord('♥') - 4)) * numbers.index(n[0]) * 2000

            else:
                res = ((ord('♥') - 4)) * numbers.index(n[0])
            lista.append(res)

        elif '♣' in n[1]:
            if (n[0] == '4' and table[0] == '3') or numbers.index(n[0]) == numbers.index(table[0]) + 1 :
                res = (ord('♣') - 1) * numbers.index(n[0]) * 2000

            else:
                res = (ord('♣') - 1) * numbers.index(n[0])
            lista.append(res)

print("Mesa: {}".format(table))
print("Mão 1: {} ---- Mão 2: {}".format(appendHand[0], appendHand[1]))
lista2 = []
for itens in appendHand:
    print(itens)
    for n in itens:
        print(n)
        lista2.append(n)

best = lista2[lista.index(max(lista))]

print("\nMelhor carta: {}".format(best))

del appendHand[0]


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
