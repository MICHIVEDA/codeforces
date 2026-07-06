import Data.List

solve :: Int -> IO()
solve 0 = return ()
solve c = do
  line1 <- getLine
  let [n, k] = map read (words line1)
  line2 <- getLine
  let boxes = map read (words line2) :: [Int]
  putStrLn $ if k >= 2 || boxes == sort boxes then "YES" else "NO"
  solve (c-1)

main :: IO()
main = do
  input <- getLine
  let c = read input
  solve c
