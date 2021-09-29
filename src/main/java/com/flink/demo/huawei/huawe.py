// HJ16 购物单 python3
n, m = map(int, input().split())
primary, annex = {}, {}
for i in range(1, m+1):
    x,y,z = map(int, input().split())
    if z==0:
        primary[i] = [x,y]
    else:
        if z in annex:
            annex[z].append([x,y])
        else:
            annex[z] = [[x,y]]

w, v =[[]], [[]]

for key in primary:
    w_tmp = []
    v_tmp = []
    w_tmp.append(primary[key][0])
    v_tmp.append(primary[key][0]*primary[key][1])
    if key in annex:
        w_tmp.append(w_tmp[0] + annex[key][0][0])
        v_tmp.append(v_tmp[0] + annex[key][0][0]*annex[key][0][1])
        if len(annex[key])>1:
            w_tmp.append(w_tmp[0] + annex[key][1][0])
            v_tmp.append(v_tmp[0] + annex[key][1][0]*annex[key][1][1])
            w_tmp.append(w_tmp[0] + annex[key][0][0] + annex[key][1][0])
            v_tmp.append(v_tmp[0] + annex[key][0][0]*annex[key][0][1] + annex[key][1][0]*annex[key][1][1])
    w.append(w_tmp)
    v.append(v_tmp)

m = len(primary)
dp=[[0]*(n+1) for _ in range(m+1)]

for i in range(1, m+1):
    for j in range(10, n+1, 10):
        max_i = dp[i-1][j]
        for k in range(len(w[i])):
            if j >= w[i][k]:
                max_i = max(max_i, dp[i-1][j-w[i][k]] + v[i][k])
        dp[i][j] = max_i
print(dp[m][n])


// HJ14 字符串排序
while True:
    try:
        num = int(input())
        data = []
        for i in range(num):
            data.append(input())
            data.sort()
        for a in data:
            print(a)
    except:
        break





