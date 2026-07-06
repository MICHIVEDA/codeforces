import Data.List

-- O(n^2)
solve :: [Int] -> Int -> Int
solve [] _ = 0
solve (x:xs) n
  | n+x > sum xs = 1
  | otherwise = 1 + solve xs (n+x)

main :: IO()
main = do
  _ <- getLine
  coinLine <- getLine
  let coins = reverse $ sort $ map read $ words coinLine :: [Int]

  let totalSum = sum coins

  let target = totalSum `div` 2

  let compoundSum = scanl' (+) 0 coins
  let res = length (takeWhile (<= target) compoundSum)

  print res

  
