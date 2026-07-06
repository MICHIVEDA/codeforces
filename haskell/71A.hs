

solve :: String -> String
solve s = if length s > 10 then take 1 s ++ show (length s - 2) ++ drop (length s - 1) s else s

main :: IO()
main = interact $ \input ->
  let l = lines input
      words = drop 1 l
      res = map solve words
  in unlines res 
