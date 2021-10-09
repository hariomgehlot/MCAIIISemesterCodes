import numpy as np 
import pandas as pd

csv_olympics=pd.read_csv(r"/home/om/Downloads/olympics1.csv")
oly_df=pd.DataFrame(csv_olympics)
oly_df["totalgoldcount"] = oly_df["Gold"]+oly_df["Gold.1"] 
print(oly_df["totalgoldcount"])