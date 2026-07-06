solve :: String -> String -> String
solve _ [] = "YES"
solve [] _ = "NO"
solve (x:xs) (h:hs)
  | x == h = solve xs hs
  | otherwise = solve xs (h:hs)

main :: IO()
main = do
  s <- getLine
  putStrLn (solve s "hello")
