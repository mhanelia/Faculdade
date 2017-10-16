from fodinha import Fodinha

f = Fodinha()

f.shuffle()

murilo = f.hand()
maressa = f.hand()
f.f_round()

f.f_appendHand(murilo)
f.f_appendHand(maressa)

print(murilo)
print(maressa)
print(f.table())
f.compare()
