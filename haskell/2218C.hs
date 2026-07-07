solve :: Int -> [Int]
solve n = [val | (l, h1, h2) <- threes, val <- [l, h1, h2]]
  where
    first = [1 .. n]
    second = [n + 1 .. 3 * n]
    threes = zip3 first (everyOther second) (everyOther (tail second))

everyOther [] = []
everyOther (x : _ : xs) = x : everyOther xs
everyOther (x : _) = [x]

runTests :: Int -> IO ()
runTests 0 = return () -- Base case: no more tests to run
runTests t = do
  nStr <- getLine
  let n = read nStr :: Int
  putStrLn $ unwords (map show (solve n))
  runTests (t - 1) -- Recursive call for the next test case

main :: IO ()
main = do
  tStr <- getLine
  let t = read tStr :: Int
  runTests t
