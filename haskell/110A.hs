main = do
  input <- getLine
  let y = length $  filter (`elem` "47") input
  let str = show y
  let res = y > 0 && all (`elem` "47") str
  if res then putStr "YES\n" else putStr "NO\n"
  
