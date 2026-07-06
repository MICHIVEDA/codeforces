solve :: String -> Int
solve s =
  let zero = length $ filter (=='0') s
      one = length $ filter (=='1') s
  in comparing s zero one

comparing :: String -> Int -> Int -> Int
comparing [] _ _ = 0
comparing (x:xs) z o
  | x == '0'  = if o > 0 then comparing xs z (o-1) else length (x:xs)
  | otherwise = if z > 0 then comparing xs (z-1) o else length (x:xs)

parse :: Int -> IO [String]
parse 0 = return []
parse n = do
  line <- getLine
  rest <- parse (n-1)
  return (line:rest) 

main :: IO()
main = do
  input <- getLine
  let n = read input :: Int
  l <- parse n
  let res = map solve l
  mapM_ (putStrLn . show) res
