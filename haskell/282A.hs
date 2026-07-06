solve :: String -> Int
solve [] = 0
solve (x:xs)
 | x == '+' = 1
 | x == '-' = -1
 | otherwise = solve xs


main :: IO()
main = interact $ \input -> show (sum $ map solve $ drop 1 $ lines input) ++ "\n"
