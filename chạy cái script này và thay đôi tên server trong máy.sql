USE [master]
GO
CREATE DATABASE [BanSach]
USE [BanSach]
GO
CREATE TABLE [dbo].[Admin](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[userName] [varchar](20) NOT NULL,
	[password] [varchar](12) NOT NULL,
 CONSTRAINT [pk_Admin] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CaiDat]    Script Date: 03/13/2023 03:23:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CaiDat](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[trangThai] [varchar](3) NULL,
	[tenWeb] [nvarchar](30) NULL,
	[moTaWeb] [nvarchar](100) NULL,
	[tuKhoaWeb] [nvarchar](30) NULL,
 CONSTRAINT [pk_CaiDat] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DonHang]    Script Date: 03/13/2023 03:23:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DonHang](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[idKhach] [int] NOT NULL,
	[idSach] [int] NOT NULL,
	[soLuong] [int] NOT NULL,
	[ngayMua] [datetime] NOT NULL,
 CONSTRAINT [pk_DonHang] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Khach]    Script Date: 03/13/2023 03:23:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Khach](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[ten] [nvarchar](100) NOT NULL,
	[email] [nvarchar](50) NOT NULL,
	[dienThoai] [varchar](12) NOT NULL,
	[userName] [varchar](20) NULL,
	[password] [varchar](12) NULL,
	[diemThuong] [int] NOT NULL,
 CONSTRAINT [pk_Khach] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Sach]    Script Date: 03/13/2023 03:23:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Sach](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[tenSach] [nvarchar](100) NOT NULL,
	[theLoai] [int] NOT NULL,
	[moTa] [nvarchar](100) NULL,
	[giaTien] [float] NULL,
	[soLuongTon] [int] NULL,
	[hinhAnh] [nvarchar](100) NULL,
 CONSTRAINT [pk_Sach] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TheLoai]    Script Date: 03/13/2023 03:23:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TheLoai](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[tenTheLoai] [nvarchar](50) NOT NULL,
	[hinhAnh] [nvarchar](100) NULL,
 CONSTRAINT [pk_TheLoai] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Admin] ON 
GO
INSERT [dbo].[Admin] ([id], [userName], [password]) VALUES (2, N'tai em', N'3')
GO
INSERT [dbo].[Admin] ([id], [userName], [password]) VALUES (3, N'thach em', N'2')
GO
INSERT [dbo].[Admin] ([id], [userName], [password]) VALUES (4, N'tam em', N'123')
GO
INSERT [dbo].[Admin] ([id], [userName], [password]) VALUES (8, N'phu', N'123')
GO
SET IDENTITY_INSERT [dbo].[Admin] OFF
GO
SET IDENTITY_INSERT [dbo].[CaiDat] ON 
GO
INSERT [dbo].[CaiDat] ([id], [trangThai], [tenWeb], [moTaWeb], [tuKhoaWeb]) VALUES (4, N'on', N'sách tôn giáo viết về ơn gọi', N'sách tôn giáo viết về ơn gọi', N'sách tôn giáo viết về ơn gọi')
GO
SET IDENTITY_INSERT [dbo].[CaiDat] OFF
GO
SET IDENTITY_INSERT [dbo].[DonHang] ON 
GO
INSERT [dbo].[DonHang] ([id], [idKhach], [idSach], [soLuong], [ngayMua]) VALUES (2, 2, 2, 2, CAST(N'2023-03-08T18:23:30.703' AS DateTime))
GO
INSERT [dbo].[DonHang] ([id], [idKhach], [idSach], [soLuong], [ngayMua]) VALUES (4, 2, 2, 2, CAST(N'2023-03-08T18:24:25.767' AS DateTime))
GO
INSERT [dbo].[DonHang] ([id], [idKhach], [idSach], [soLuong], [ngayMua]) VALUES (6, 2, 2, 2, CAST(N'2023-03-08T18:25:02.447' AS DateTime))
GO
INSERT [dbo].[DonHang] ([id], [idKhach], [idSach], [soLuong], [ngayMua]) VALUES (8, 2, 2, 2, CAST(N'2023-03-08T18:25:54.787' AS DateTime))
GO
INSERT [dbo].[DonHang] ([id], [idKhach], [idSach], [soLuong], [ngayMua]) VALUES (9, 3, 3, 6, CAST(N'2023-03-08T18:25:54.787' AS DateTime))
GO
INSERT [dbo].[DonHang] ([id], [idKhach], [idSach], [soLuong], [ngayMua]) VALUES (10, 4, 2, 5, CAST(N'2023-03-08T18:25:54.787' AS DateTime))
GO
INSERT [dbo].[DonHang] ([id], [idKhach], [idSach], [soLuong], [ngayMua]) VALUES (11, 2, 2, 2, CAST(N'2023-03-08T18:26:03.987' AS DateTime))
GO
INSERT [dbo].[DonHang] ([id], [idKhach], [idSach], [soLuong], [ngayMua]) VALUES (12, 3, 3, 6, CAST(N'2023-03-08T18:26:03.987' AS DateTime))
GO
INSERT [dbo].[DonHang] ([id], [idKhach], [idSach], [soLuong], [ngayMua]) VALUES (13, 4, 2, 5, CAST(N'2023-03-08T18:26:03.987' AS DateTime))
GO
INSERT [dbo].[DonHang] ([id], [idKhach], [idSach], [soLuong], [ngayMua]) VALUES (14, 16, 2, 5, CAST(N'2023-03-13T13:54:31.137' AS DateTime))
GO
INSERT [dbo].[DonHang] ([id], [idKhach], [idSach], [soLuong], [ngayMua]) VALUES (15, 16, 3, 5, CAST(N'2023-03-13T13:54:31.160' AS DateTime))
GO
INSERT [dbo].[DonHang] ([id], [idKhach], [idSach], [soLuong], [ngayMua]) VALUES (16, 16, 2, 5, CAST(N'2023-03-13T15:21:32.877' AS DateTime))
GO
INSERT [dbo].[DonHang] ([id], [idKhach], [idSach], [soLuong], [ngayMua]) VALUES (17, 16, 3, 5, CAST(N'2023-03-13T15:21:32.893' AS DateTime))
GO
SET IDENTITY_INSERT [dbo].[DonHang] OFF
GO
SET IDENTITY_INSERT [dbo].[Khach] ON 
GO
INSERT [dbo].[Khach] ([id], [ten], [email], [dienThoai], [userName], [password], [diemThuong]) VALUES (2, N'Thạch', N'thach@gmail.com', N'090119089', N'thachga', N'thachga', 2)
GO
INSERT [dbo].[Khach] ([id], [ten], [email], [dienThoai], [userName], [password], [diemThuong]) VALUES (3, N'Tài', N'tai@gmail.com', N'090119779', N'taiga', N'taiga', 4)
GO
INSERT [dbo].[Khach] ([id], [ten], [email], [dienThoai], [userName], [password], [diemThuong]) VALUES (4, N'Tâm', N'tam@gmail.com', N'090989089', N'tamga', N'tamga', 1)
GO
INSERT [dbo].[Khach] ([id], [ten], [email], [dienThoai], [userName], [password], [diemThuong]) VALUES (16, N'Nguyễn Phú', N'phu@p', N'+1231234', N'phuga', N'phuga', 389)
GO
SET IDENTITY_INSERT [dbo].[Khach] OFF
GO
SET IDENTITY_INSERT [dbo].[Sach] ON 
GO
INSERT [dbo].[Sach] ([id], [tenSach], [theLoai], [moTa], [giaTien], [soLuongTon], [hinhAnh]) VALUES (2, N'Cộng đoàn thánh hiến	 2', 7, N'ơn gọi đời sống linh mục	', 759, 767, N'thanhhien16.jpg')
GO
INSERT [dbo].[Sach] ([id], [tenSach], [theLoai], [moTa], [giaTien], [soLuongTon], [hinhAnh]) VALUES (3, N'Thánh Hiền 1', 14, N'idk', 20, 2, N'thanhhien1.jpg')
GO
INSERT [dbo].[Sach] ([id], [tenSach], [theLoai], [moTa], [giaTien], [soLuongTon], [hinhAnh]) VALUES (12, N'Một linh mục trong gia đình', 14, N'sách tôn giáo viết về ơn gọi', 65, 50, N'thanhhien2.jpg')
GO
INSERT [dbo].[Sach] ([id], [tenSach], [theLoai], [moTa], [giaTien], [soLuongTon], [hinhAnh]) VALUES (14, N'Cộng đoàn thánh hiến', 14, N'ơn gọi đời sống linh mục', 60, 20, N'thanhhien3.jpg')
GO
INSERT [dbo].[Sach] ([id], [tenSach], [theLoai], [moTa], [giaTien], [soLuongTon], [hinhAnh]) VALUES (15, N'Đời Sống Thánh Hiến', 14, N'sách tôn giáo viết về ơn gọi', 25, 123, N'thanhhien4.jpg')
GO
INSERT [dbo].[Sach] ([id], [tenSach], [theLoai], [moTa], [giaTien], [soLuongTon], [hinhAnh]) VALUES (16, N'Đời Sống Thánh Hiến 4', 11, N'sách tôn giáo viết về ơn gọi	', 123, 22, N'thanhhien7.jpg')
GO
INSERT [dbo].[Sach] ([id], [tenSach], [theLoai], [moTa], [giaTien], [soLuongTon], [hinhAnh]) VALUES (17, N'Đời Sống Thánh Hiến	', 7, N'ơn gọi đời sống linh mục	', 444, 3, N'thanhhien11.jpg')
GO
INSERT [dbo].[Sach] ([id], [tenSach], [theLoai], [moTa], [giaTien], [soLuongTon], [hinhAnh]) VALUES (18, N'Khiết tịnh', 14, N'Khiết tịnh', 11, 1, N'thanhhien16.jpg')
GO
INSERT [dbo].[Sach] ([id], [tenSach], [theLoai], [moTa], [giaTien], [soLuongTon], [hinhAnh]) VALUES (20, N'Sống thánh thiện', 14, N'Sống thánh thiện', 432, 33, N'thanhhien7.jpg')
GO
INSERT [dbo].[Sach] ([id], [tenSach], [theLoai], [moTa], [giaTien], [soLuongTon], [hinhAnh]) VALUES (21, N'Name of the book', 11, N'Just a book', 444, 1, N'thanhhien9.jpg')
GO
INSERT [dbo].[Sach] ([id], [tenSach], [theLoai], [moTa], [giaTien], [soLuongTon], [hinhAnh]) VALUES (22, N'Name of the book 2', 11, N'Just a book but...', 578, 1, N'thanhhien9.jpg')
GO
SET IDENTITY_INSERT [dbo].[Sach] OFF
GO
SET IDENTITY_INSERT [dbo].[TheLoai] ON 
GO
INSERT [dbo].[TheLoai] ([id], [tenTheLoai], [hinhAnh]) VALUES (2, N'THIẾU NHI', N'thieunhi.jpg')
GO
INSERT [dbo].[TheLoai] ([id], [tenTheLoai], [hinhAnh]) VALUES (3, N'GIÁO KHOA-THAM KHẢO', N'giaokhoa.jpg')
GO
INSERT [dbo].[TheLoai] ([id], [tenTheLoai], [hinhAnh]) VALUES (4, N'VĂN HỌC', N'a')
GO
INSERT [dbo].[TheLoai] ([id], [tenTheLoai], [hinhAnh]) VALUES (5, N'TÂM LÝ-KỸ NĂNG SỐNG', N'a')
GO
INSERT [dbo].[TheLoai] ([id], [tenTheLoai], [hinhAnh]) VALUES (6, N'SÁCH NGOẠI NGỮ', N'a')
GO
INSERT [dbo].[TheLoai] ([id], [tenTheLoai], [hinhAnh]) VALUES (7, N'KINH TẾ', N'a')
GO
INSERT [dbo].[TheLoai] ([id], [tenTheLoai], [hinhAnh]) VALUES (8, N'CHÍNH TRỊ-TRIẾT HỌC', N'a')
GO
INSERT [dbo].[TheLoai] ([id], [tenTheLoai], [hinhAnh]) VALUES (9, N'BÁO-TẠP CHÍ', N'a')
GO
INSERT [dbo].[TheLoai] ([id], [tenTheLoai], [hinhAnh]) VALUES (10, N'GIÁO TRÌNH', N'a')
GO
INSERT [dbo].[TheLoai] ([id], [tenTheLoai], [hinhAnh]) VALUES (11, N'GIẢI TRÍ', N'a')
GO
INSERT [dbo].[TheLoai] ([id], [tenTheLoai], [hinhAnh]) VALUES (14, N'TÔN GIÁO', N'thanhhien1.jpg')
GO
SET IDENTITY_INSERT [dbo].[TheLoai] OFF
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__Admin__66DCF95CBB7BC6E5]    Script Date: 03/13/2023 03:23:56 PM ******/
ALTER TABLE [dbo].[Admin] ADD UNIQUE NONCLUSTERED 
(
	[userName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__Khach__66DCF95C46DBC6CE]    Script Date: 03/13/2023 03:23:56 PM ******/
ALTER TABLE [dbo].[Khach] ADD UNIQUE NONCLUSTERED 
(
	[userName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__Sach__F44C287B3DBDDBCB]    Script Date: 03/13/2023 03:23:56 PM ******/
ALTER TABLE [dbo].[Sach] ADD  CONSTRAINT [UQ__Sach__F44C287B3DBDDBCB] UNIQUE NONCLUSTERED 
(
	[tenSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__TheLoai__BA244AC55FCE1E83]    Script Date: 03/13/2023 03:23:56 PM ******/
ALTER TABLE [dbo].[TheLoai] ADD  CONSTRAINT [UQ__TheLoai__BA244AC55FCE1E83] UNIQUE NONCLUSTERED 
(
	[tenTheLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[DonHang]  WITH CHECK ADD  CONSTRAINT [fk_Khach] FOREIGN KEY([idKhach])
REFERENCES [dbo].[Khach] ([id])
GO
ALTER TABLE [dbo].[DonHang] CHECK CONSTRAINT [fk_Khach]
GO
ALTER TABLE [dbo].[DonHang]  WITH CHECK ADD  CONSTRAINT [fk_Sach] FOREIGN KEY([idSach])
REFERENCES [dbo].[Sach] ([id])
GO
ALTER TABLE [dbo].[DonHang] CHECK CONSTRAINT [fk_Sach]
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD  CONSTRAINT [fk_TheLoai] FOREIGN KEY([theLoai])
REFERENCES [dbo].[TheLoai] ([id])
GO
ALTER TABLE [dbo].[Sach] CHECK CONSTRAINT [fk_TheLoai]
GO
ALTER TABLE [dbo].[CaiDat]  WITH CHECK ADD  CONSTRAINT [CK__CaiDat__trangTha__36B12243] CHECK  (([trangThai]='off' OR [trangThai]='on'))
GO
ALTER TABLE [dbo].[CaiDat] CHECK CONSTRAINT [CK__CaiDat__trangTha__36B12243]
GO
USE [master]
GO
ALTER DATABASE [BanSach] SET  READ_WRITE 
GO
