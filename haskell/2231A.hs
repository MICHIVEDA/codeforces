import Control.Monad (replicateM_)
solve :: Int -> [Int]
solve n = [i | i <- [1..2*n], i `mod` 2 == 1] 

main :: IO()
main = do
  cases <- getLine
  let n = read cases :: Int
  replicateM_ n $ do
    l <- getLine
    let len = read l :: Int
    putStrLn (unwords (map show (solve len)))
