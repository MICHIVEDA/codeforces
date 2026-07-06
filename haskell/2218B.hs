import Control.Monad(replicateM_)

solve :: [Int] -> Int
solve xs =
  let tSum = sum xs
      max = maximum xs
  in (-tSum) + (2*max)

main :: IO()
main = do
  lineN <- getLine
  let n = read lineN :: Int
  replicateM_ n $ do
    line <- getLine
    let num = map read (words line) :: [Int]
    print (solve num)
