
solve :: String -> Char -> Int -> String
solve _ _ 7 = "YES"
solve [] _ _ = "NO"
solve (x:xs) prev n
  | x == prev = solve xs x (n+1)
  | otherwise = solve xs x 1


main :: IO()
main = do
  team <- getLine
  putStrLn (solve team ' ' 0)
