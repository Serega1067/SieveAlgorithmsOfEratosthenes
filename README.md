# Implementation of the sieve algorithm of Eratosthenes.
## Task.
The number n (n > 1) is given. Print a string consisting 
of prime numbers less than n. Use the sieve of Eratosthenes.
## Block diagram.
```mermaid
flowchart TB
    Start([start])
    A[/n/]
    B[sieve = boolean array<br/>primes = Integer ArrayList]
    C{{i = 2, i < n, 1}}
    D{!sieve i}
    E["primes.add(i)"]
    F{{j = i * i, j < n, j = j + i}}
    G["sieve[j] = true"]
    H[/primes/]
    End([end])
    Start-->A-->B-->C-->H-->End
    C-->D--true-->E
    D-->F-->G-->F
    F-->C
```

