import java.util.*;

class Sieve {
    int max;
    Set<Integer> visited = new HashSet<>();
    Sieve(int maxPrime) {
        this.max = maxPrime;
    }

    private void addVisited(int n) {
        int i = 2;
        while(n * i <= this.max) {
            visited.add(n * i);
            i++;
        }
    }

    List<Integer> getPrimes() {
        List<Integer> primes = new LinkedList();
        for(int i = 2; i <= max; i++) {
            if(visited.contains(i)) continue;
            primes.add(i);
            addVisited(i);
        }
        return primes;
    }
}
