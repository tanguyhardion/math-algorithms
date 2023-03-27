import mpmath

def generate_e(n):
    mpmath.mp.dps = n
    return str(mpmath.e)

with open("e.txt", "w") as f:
    f.write(generate_e(1000000))

