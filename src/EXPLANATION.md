## Reshaping the problem

Suppose that we are allowed `k` number of tests, now instead of finding out the number of <pigs>, we are interested in finding out the <bucket> which contains the <poisonous> liquid from the given <buckets>. Now the quesition is, _what is the `maximum number of buckets` from which we will be able to find the one containing $poison$ with the given `n` number of pigs?_

In order to make the problem more simpler lets define a `T(n, k)`, which will be the `maximum number of buckets` from which we can determine the poisonous one with `n` pigs and `k` tests. We know have to find general expression of `T(n, k)` in terms of `n` and `k` _(assume that `k > 0`, otherwise there will be only one `bucket`, the one with poison which can be identified without testing)_.

### Case, when there is only one Pig

When `n` equals `one` the only option to check is to make the Pig drink the liquid from one bucket and wait for the `timeToDie` to check whether the pig dies or not, if the pig dies we know the result if not we still are able to eliminate <one bucket> from the given total `buckets`. Remember one thing we `cannot` make the pig to drink simultaneously from `more than one bucket` at any given time, one pig one bucket at a given time, the pigs `lives or dies` depends on the `bucket` chosen.

Suppose the number of allowed tests is one, i.e,. `k = 1`. In this case if number of `bucket` is one we can determine the result same is in the case when the number of `buckets` is two, with one test the result will reveal the information of the other bucket also. But, if the `buckets > 2` then we won't be able to determine the result with one test becaue in first failure we would need to carry out more test to reach the result so we will run out of test. With `one pig` and `one test` we can deal with at most two buckets such that `T(1, 1) = 2`.

With `k` tests and `1` pig we can check at most `k + 1` buckets. i.e, if k buckets are revealed using `k tests` the reamining one is automatically revealed. `T(1, k) = k + 1`

### A General Solution with `n pigs` and `k tests`

We now know that with `1 pig` and `k tests` we can check `k + 1 buckets`. Now, with **each** `pig` we can carry out `k + 1` tests combining the result we end up with `T(n, k) = (k + 1)^n^` buckets.

### Solution

By now we know the `(k + 1)^n^` equals the number of `buckets` which is provided in the question. An `k` which is the number of test can be found using `timeToTest` `/` `timeToDie`, of course number should be rounded to the next integer.

The equation becomes ==buckets = (k + 1)^n^==, simplyfying that gives the equation `pigs = log(buckets) / log(k + 1)`, which is our desired result.
