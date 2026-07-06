main :: IO()
main = do
  input <- getLine
  let k = read (last $ words input) :: Int
  nextLine <- getLine
  let format = map read (words nextLine) :: [Int]
  let i = last $ take k format
  let res = length $ filter (\s -> s >= i &&  s > 0) $ map read (words nextLine)
  print (res :: Int)
