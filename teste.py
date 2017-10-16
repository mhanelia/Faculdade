numbers = ['0', "4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"]
suits =   ['0', "♦", "♠", "♥", "♣"]

appendHand = ['7♣', 'J♥', '3♣']

lista = []
mesa = 'Q♦'
    for n in appendHand:
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
            if numbers.index(n[0]) == numbers.index(mesa[0]) + 1 :
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
