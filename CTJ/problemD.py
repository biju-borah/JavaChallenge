word = input()
upper = 0
lower = 0
for i in range(0, len(word)):
    if word[i].isupper():
        upper += 1
    else:
        lower += 1
if upper > lower:
    print(word.upper())
elif lower > upper:
    print(word.lower())
else:
    print(word.lower())
