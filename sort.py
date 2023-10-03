import numpy as np
data = np.loadtxt('in.txt', delimiter=' ', dtype=int)
print(sorted(data))
