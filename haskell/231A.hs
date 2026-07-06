main :: IO()
main = interact $ \input ->
  let allLines = lines input
      n = read (head allLines) :: Int
      l = take n (drop 1 allLines)
      w = map words l
      i = map (map read) w :: [[Int]]
      res = length $ filter (>= 2) (map sum i)
  in show res ++ "\n"
