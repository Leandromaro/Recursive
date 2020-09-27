# Backtracking Algorithms

Backtracking is an algorithmic-technique for solving problems recursively by trying to build a solution incrementally, one piece at a time, removing those solutions that fail to satisfy the constraints of the problem at any point of time (by time, here, is referred to the time elapsed till reaching any level of the search tree).

Basic idea: **FIND ALL POSIBLE COMBINATIONS**. When an element its found we "backtrack" erasing that element and continuing analizing other cases.
Like every recursive algorithm it counts with two elements
 - Base case
 - Recursive case

For example, consider the SudoKo solving Problem, we try filling digits one by one. Whenever we find that current digit cannot lead to a solution, we remove it (backtrack) and try next digit. This is better than naive approach (generating all possible combinations of digits and then trying every combination one by one) as it drops a set of permutations whenever it backtracks.

![Sodoku](https://media.geeksforgeeks.org/wp-content/uploads/sudoku.jpg)

## Excercises 

### Find all posible number combinations that match a given number

```
    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> numeros = new ArrayList<>();
        combinacionesSuma(4, numeros,0);
    }

    public static void combinacionesSuma(int numero, ArrayList<Integer> numeros, int suma){
        if(suma == numero){ // Base Case
            System.out.println(numeros);
        }else { // Recursive Case
            for (int i = 1; i<=numero; i++){
                suma += i;
                if (suma <= numero){
                    numeros.add(i);
                    combinacionesSuma(numero,numeros,suma);
                    numeros.remove(numeros.indexOf(i));
                }
                suma -= i;
            }
        }
    }

```

### Find all posible *Ip combination* given a String

```
public static int solution(String S) {
        List<String> allIpAddresses = new ArrayList<>();
        int[] path = new int[4];
        snapshotIp(allIpAddresses, S, 0, path, 0);
        return allIpAddresses.size();
    }

    private static void snapshotIp(List<String> allIpAddresses, String s, int builderIndex, int[] path, int segment) {
        if (segment==4 && builderIndex == s.length()){
            allIpAddresses.add(path[0]+ "." + path[1] + "." + path[2]+ "." + path[3]);
            return;
        }else if ((segment==4 || builderIndex == s.length())){
            return;
        }
        for (int len = 1; len <=3 && builderIndex + len <= s.length(); len++){
            String snapshot = s.substring(builderIndex, builderIndex+len);
            int value = Integer.parseInt(snapshot);
            if (value>255 || len>=2 && s.charAt(builderIndex)=='0'){
                break;
            }
            path[segment] = value;
            snapshotIp(allIpAddresses,s,builderIndex + len, path, segment+1);
            path[segment] = -1;
        }
    }
```
