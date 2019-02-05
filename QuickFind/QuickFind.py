class QuickFind:

    data = None

    def __init__(self,data=[]):
        self.data = data

    def isConnected(self,p,q):
        if(self.data[p] == self.data[q]):
            return True
        else:
            return False

    def union(self,p,q):

        pVal = self.data[p]
        qVal = self.data[q]

        for x in range(0,len(self.data)):
            # if x's id is equal to p's id
            if self.data[x] == pVal:
                # x's id is replaced with q's id
                self.data[x] = qVal


if __name__ == "__main__":

    # Test data: [0,1,2,3,4,5,6,7,8,9]

    # test operations = expected output
    
    #   union(2,1) = [0,1,1,3,4,5,6,7,8,9]
    #   isConnected(1,2) = True
    #   isConnected(1,3) = False
    #   union(1,3) = [0,3,3,3,4,5,6,7,8,9]

    inStr = input("Enter values separated by comma: ")
    inVal = list(map(lambda x: int(x),list(str(inStr).split(","))))
    qf = QuickFind(inVal)

    qf.union(2,1)
    print(qf.data)
    print(qf.isConnected(1,2))
    print(qf.isConnected(1,3))
    qf.union(1,3)
    print(qf.data)