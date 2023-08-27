string = input("Enter the String: ")
x = list(string)

letter_list = []

for word in x:
    letters = list(word)
    letter_list.extend(letters)

letter_list.sort()

sorted_string = ''.join(letter_list)
print(sorted_string)
# operations = 0
# prev_node = ''
# count = 0
# individual_nodes = set()

# for node in x:
#     if node == prev_node:
#         count += 1
#     elif count > 0:
#         operations += (count + 1) // 2
#         count = 0
#     prev_node = node

# if count > 0:
#     operations += (count + 1) // 2

# individual_nodes = set(x) - set(prev_node for prev_node, _ in zip(x, x[1:]) if prev_node == _)

# operations += len(individual_nodes)

# print("Minimum number of operations required:", operations)
set=set(sorted_string)
set_length = len(set)
print(set_length)