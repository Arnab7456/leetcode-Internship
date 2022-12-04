class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        vow = set('aeiouAEIOU')
        
        # count the frequency of characters in the two halves
        a = Counter(s[:len(s)//2])
        b = Counter(s[len(s)//2:])
        
        # Compute the sum of the vowels' frequency
        sumA = sum(a[v] for v in vow)
        sumB = sum(b[v] for v in vow)

        # check if they are the same
        return sumA == sumB
