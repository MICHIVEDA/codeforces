import Control.Monad(replicateM_)

main :: IO()
main = do
  lineN <- getLine
  let n = read lineN :: Int
  replicateM_ n $ putStrLn "67"
