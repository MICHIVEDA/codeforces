solve :: [Int] -> Int
solve [n,k]
  | k > z = 2*(k-z)
  | otherwise = 2*k - 1
  where z = (n+1) `div` 2

main :: IO()
main = do
  line <- getLine
  let [n,k] = map read $ words line :: [Int]
  print (solve [n,k])

