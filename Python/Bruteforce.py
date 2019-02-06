class Bruteforce:

    data = None

    def __init__(self, data=[]):
        self.data = data

    def sum3(self):

        count = 0
        n = len(self.data)

        for i in range (0,n):
            for j in range(i+1, n):
                for k in range (j+1,n):
                    
                    iVal = self.data[i]
                    jVal = self.data[j]
                    kVal = self.data[k]

                    if(iVal + jVal + kVal == 0): 
                        count+=1
        
        return count

if __name__ == "__main__":

    # Test input: 30,-40,-20,-10,40,0,10,5
    # Test output: 4

    inStr = input("Enter values separated by comma: ")
    inVal = list(map(lambda x: int(x),list(str(inStr).split(","))))
    bf = Bruteforce(inVal)
    print(bf.sum3())