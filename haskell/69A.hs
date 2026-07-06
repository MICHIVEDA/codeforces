import Data.List (transpose)

parse :: Int -> IO [[Int]]
parse 0 = return []
parse n = do
  l <- getLine
  let currentLine = map read (words l) :: [Int]
  rest <- parse (n-1)
  return (currentLine : rest)

solve :: [[Int]] -> String
solve v = if all (==0) (map sum $ transpose v) then "YES" else "NO"

main :: IO()
main = do
  n <- getLine
  res <- parse $ (read n :: Int)
  putStrLn (solve res)
