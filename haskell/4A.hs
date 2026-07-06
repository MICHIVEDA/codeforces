main :: IO()
main = do
 input <- getLine
 let x = read input :: Int
 if x > 2 && x `mod` 2 == 0 then putStrLn "YES" else putStrLn "NO"
