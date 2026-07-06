solve :: Int -> Int -> Int -> Int
solve n m a = ((n + a -1) `div` a) * ((m + a -1) `div` a)

main :: IO()
main = do
  input <- getLine
  let [n,m,a] = map read $ words input :: [Int]
  putStrLn $ show $ solve n m a
